# Development

## Project Name

"UiShock" will be the formal name of this project.
It aims to play off the PiShock recognition, describe the project immediately, and sound like "You and I shock".

## Version Control

[Git](https://git-scm.com) will be used to store source changes.
[GitHub](https://github.com) will be the source code host.
[Git Flow](https://leanpub.com/git-flow/read) will be used to structure branches.

Commits should generally start with one of the following verbs for classification purposes:
- Adding
- Deleting
- Documenting
- Fixing
- Improving
- Optimizing
- Refactoring
- Releasing
- Reverting
- Testing
- Updating

## Source Formatting

[EditorConfig](https://editorconfig.org) will suggest a standard consistent format to code editors.
Some like YAML require specific formatting or else parsers will fail.

## Source Analysis

[SonarCloud](https://www.sonarsource.com/products/sonarcloud/) will be used to scan source code for potential issues.

## Task Runner

[Make](https://www.gnu.org/software/make/manual/make.html) will be used to stitch together common tasks.
A [Makefile](/Makefile) in the project root will include common tasks like building, testing, running, etc.

## Server

### Programming Language

[Java](https://www.java.com/en/) will be used to develop the server side processing.
The latest LTS should be used, 21 at the time of this writing.
It is my most productive language as I use it for a day job.

### Build Tool

[Gradle](https://gradle.org/) will be the server-side build tool and dependency manager.
There is no real reason I have to use this over Maven beyond being less verbose.

### Framework

[Spring Boot](https://spring.io/projects/spring-boot) will be the server-side framework.
It is ubiquitous and has every manner of feature under the sun available.

### Logging

The default Spring library will be used if it meets the below conditions.
Otherwise, [Logback](https://logback.qos.ch/) will be implemented.

Logging must always be done to console in a JSON format.
Messages should be static, with dynamic information added via key-value pairs to logging context.
By outputting to console in JSON format we can leverage Unix processes for log persistence.
We can then audit those logs for events using tools like `jq`.

## Client

This will be a multi-page client on server rendered HTML.
JavaScript should be completely optional to correct operation of the client.

[Pico CSS](https://picocss.com/) will likely be used during development for mockups.
This might be replaced later with something with more interaction feedback.

[HTMX](https://htmx.org/) might be used for client interaction enhancement.

## Production Environment

### Runtime

A VPS will be used to host this application.
Systemd will be used for service management.

### Database

[SQLite](https://www.sqlite.org/) will be the database persistence engine.
I do not like relying on expensive hosted processes.

### Health Check

[Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/current/reference/html/actuator.html) will provide a health endpoint.
[UptimeRobot](https://uptimerobot.com) will monitor that endpoint for any anomalies.

### Exception Alerts

[Sentry](https://sentry.io) is a great error and exception monitor.
It can take almost any programming environment and has a generous free tier.
Care should be taken not to run Sentry in development environments to keep the history clean.
