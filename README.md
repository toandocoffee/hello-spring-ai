You can find series of Spring AI from [Hello Spring AI](https://google.com)

To obtain the API key for OpenAI, or the API key, Endpoint, and model for Azure OpenAI, you can find the necessary information in the footnotes of the article above.

### Run with OpenAI API

```shell
## Gradle
OPENAI_API_KEY=<replace your key here>  \
./gradlew bootRun --args='--spring.profiles.active=openai'

## Maven
OPENAI_API_KEY=<replace your key here> \
./mvnw spring-boot:run -Dspring-boot.run.arguments="--spring.profiles.active=openai"

```

### Run with Azure OpenAI API

```shell
AZURE_OPENAI_API_KEY=<replace your apikey> \                                  
AZURE_OPENAI_ENDPOINT=<replace your endpoint> \
AZURE_OPENAI_MODEL=<replace your model> \
./gradlew bootRun --args='--spring.profiles.active=azure-openai'

## Maven
AZURE_OPENAI_API_KEY=<replace your apikey> \                                  
AZURE_OPENAI_ENDPOINT=<replace your endpoint> \
AZURE_OPENAI_MODEL=<replace your model> \
./mvnw spring-boot:run -Dspring-boot.run.arguments="--spring.profiles.active=azure-openai"
```