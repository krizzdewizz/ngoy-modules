# ngoy-modules

[ngoy](https://github.com/krizzdewizz/ngoy) is a template engine for the JVM, based on the Angular component architecture.

This is the repo for additional modules.

- [markdown](https://github.com/krizzdewizz/ngoy-modules/tree/master/ngoy-module-markdown) - Write Markdown inside an element or in a `.md` resource

## Usage

Add the module dependency to your ngoy project:

`build.gradle`:
```
repositories {
	maven { url "https://jitpack.io" }
	implementation("com.github.krizzdewizz.ngoy-modules:MODULE-NAME:1.0.0")

	// example:
	// implementation("com.github.krizzdewizz.ngoy-modules:ngoy-module-markdown:1.0.0")
}
```

`pom.xml`:
```xml
<repositories>
	<repository>
	    <id>jitpack.io</id>
	    <url>https://jitpack.io</url>
	</repository>
</repositories>

<dependency>
    <groupId>com.github.krizzdewizz.ngoy-modules</groupId>
    <artifactId>MODULE-NAME</artifactId>
    <version>1.0.0</version>
</dependency>
```
