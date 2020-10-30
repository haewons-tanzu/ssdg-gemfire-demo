# ssdg-gemfire-demo

## 1. Build 
```console
$ ./gradlew clean assemble
```

## 2. Check manifest.yml file
Ensure that the name of GemFire service instance is correct.
```yml
---
applications:
  - name: spring-session-demo
    path: ./build/libs/session-0.0.1-SNAPSHOT.jar
    buildpacks: [java_buildpack_offline]
    services: [my-sessioncache]
    
```

## 3. Invoke the url and check if session is not changed.
```url
https://spring-session-demo.<YOUR-DOMAIN>/session
```
