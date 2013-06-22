# Glassfish Custom Logger


## Take as it
- copy jar into `glassfish/domains/domain1/lib/ext/`
- edit logging.properties file into `glassfish/domains/domain1/config/`
- replace `com.sun.enterprise.server.logging.GFFileHandler.formatter=com.sun.enterprise.server.logging.UniformLogFormatter` by `com.sun.enterprise.server.logging.GFFileHandler.formatter=codetroopers.GlassfishCustomLogger`
- enjoy

## Customize output

- edit GlassfishCustomLogger.java
- build with maven
- copy jar into `glassfish/domains/domain1/lib/ext/`
- edit `com.sun.enterprise.server.logging.GFFileHandler.formatter=` if not yet done
- enjoy

## Output example

    16:55:05,173 INFO    (1) Running GlassFish Version: GlassFish Server Open Source Edition 3.1.2 (build 23) 
    16:55:05,173 SEVERE  (1) Cannot load formatter class codetroopers.GlassfishCustomLogger 
    16:55:05,982 INFO    (30) Grizzly Framework 1.9.46 started in: 44ms - bound to [0.0.0.0:8181] 
    16:55:05,982 INFO    (33) Grizzly Framework 1.9.46 started in: 24ms - bound to [0.0.0.0:4848] 
    16:55:05,988 INFO    (29) Grizzly Framework 1.9.46 started in: 78ms - bound to [0.0.0.0:8080] 
    16:55:05,994 INFO    (37) Grizzly Framework 1.9.46 started in: 21ms - bound to [0.0.0.0:3700] 
    16:55:06,000 INFO    (39) Grizzly Framework 1.9.46 started in: 10ms - bound to [0.0.0.0:7676] 
    16:55:06,159 INFO    (1) The Admin Console is already installed, but not yet loaded. 
    16:55:06,446 INFO    (1) WEB0169: Created HTTP listener [http-listener-1] on host/port [0.0.0.0:8080] 
    16:55:06,463 INFO    (1) WEB0169: Created HTTP listener [http-listener-2] on host/port [0.0.0.0:8181] 
    16:55:06,476 INFO    (1) WEB0169: Created HTTP listener [admin-listener] on host/port [0.0.0.0:4848] 
    16:55:06,502 INFO    (1) WEB0171: Created virtual server [server] 
    16:55:06,506 INFO    (1) WEB0171: Created virtual server [__asadmin] 
    16:55:06,906 INFO    (1) WEB0172: Virtual server [server] loaded default web module [] 
    16:55:07,873 INFO    (1) core.start_container_done 
    16:55:07,892 INFO    (1) Registered org.glassfish.ha.store.adapter.cache.ShoalBackingStoreProxy for persistence-type = replicated in BackingStoreFactoryRegistry 
    16:55:07,994 INFO    (1) GlassFish Server Open Source Edition 3.1.2 (23) heure de démarrage : Felix (2 289 ms), services de démarrage (3 177 ms), total (5 466 ms) 
    16:55:09,067 INFO    (48) JMX005: JMXStartupService had Started JMXConnector on JMXService URL service:jmx:rmi://localhost:8686/jndi/rmi://localhost:8686/jmxrmi 
    16:55:34,763 INFO    (76) L'arrêt du serveur est en cours 
    16:55:37,039 INFO    (76) JMX002: JMXStartupService: Stopped JMXConnectorServer: null 
    16:55:37,040 INFO    (76) JMX001: JMXStartupService and JMXConnectors have been shut down. 


