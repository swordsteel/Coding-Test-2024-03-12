# Coding Test

### Scenario

The application you will be building is a questionnaire.

We want you to build a REST API Service which will provide the questions. Please use hardcoded/mocked repository to avoid using real data sources.

It is expected that you will produce:

- Tested maintainable code
- Clean code and OOP design

### Considerations

Include whatever documentation/notes you feel is appropriate; this should include some details of assumptions made, areas you feel could be improved and instructions of how to run your app.

(*there are a lot of thing that can be done to make this in to something better, like using H2 to fake a database, use id's to get questionnaire and a table to store answers*) 

## Intellij Ultima

Start application and for calling the endpoint, there is a `/http/questionController.http` with environment for develop and docker  

## Docker

To build and run **Coding Test** in docker. 

```shell
./run.sh
```

Get data by going to [questions ](http://localhost:5000/api/questions) when docker running.
