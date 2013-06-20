package codetroopers;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;

public class GlassfishCustomLogger extends SimpleFormatter {
    private final String newLine = System.getProperty("line.separator");
    private final DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss,SSS");

    @Override
    public synchronized String format(LogRecord logRecord) {
        StringBuilder out = new StringBuilder();

        // time only
        Date date = new Date();
        date.setTime(logRecord.getMillis());

        out.append(dateFormat.format(date));
        out.append(" ");

        // level (longest is "WARNING" = 7 chars, space fill for level output)
        String level = logRecord.getLevel().getName();

        int numSpaces = 7 - level.length();

        out.append(level);

        for (int i = 0; i < numSpaces + 1; i++) {
            out.append(" ");
        }

        // package
        //        out.append("[");
        //        out.append(logRecord.getSourceClassName());
        //        out.append("] ");

        // thread (name?)
        out.append("(");
        out.append(logRecord.getThreadID());
        out.append(") ");

        // message
        out.append(formatMessage(logRecord));
        out.append(newLine);

        // optional stack trace
        if (logRecord.getThrown() != null) {
            try {
                StringWriter sw = new StringWriter();
                PrintWriter pw = new PrintWriter(sw);
                logRecord.getThrown().printStackTrace(pw);
                pw.close();
                out.append(sw.toString());
            } catch (Exception e) {
            }
        }

        return out.toString();
    }
}
