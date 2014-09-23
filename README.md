service-template
================

a spring-boot/docker service template

Provides an embedded tomcat, spring dependencies and enpoints.
Endpoints:
    /version (only if you @Bean the VersionController)
    /metrics
    /metrics/{name}
    /trace
    /dump
    /mappings
    /info
    /configprops
    /beans
    /autoconfig
