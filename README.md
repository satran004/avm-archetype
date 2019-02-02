Maven archetype which is used to generate Aion AVM based smart contract project in java.

## Usage:

```
$> mvn archetype:generate -DarchetypeGroupId=org.aion4j -DarchetypeArtifactId=avm-archetype -DarchetypeVersion=0.4
```

Current archetype version: 0.4

- In the generated project's pom.xml, change **aion4j.plugin.version** property to latest version of [aion4j-maven-plugin](https://github.com/satran004/aion4j-maven-plugin)
