# karn-client
Client application based on spring cloud

## It uses karn-cloud-config-server running on port 8001 which in turn fetches the properties from git location
### https://github.com/AshishKumarKarn/cloud-config-server-files/      config-data     /karn-client.<extension>


# To refresh the property file (config file from cloud) without restarting the application
RUN: `curl -H 'Content-Type: application/json' -X POST  http://localhost:8002/actuator/refresh`
