# expedia_exercises
A Spring Java app, which can easily be deployed to Heroku.

This application supports the [Getting Started with Java on Heroku](https://devcenter.heroku.com/articles/getting-started-with-java) article - check it out.

but, you need to do the steps for Creating a Java Web Application Using Embedded Tomcat check below link :
https://devcenter.heroku.com/articles/create-a-java-web-application-using-embedded-tomcat .

[![Deploy to Heroku](https://www.herokucdn.com/deploy/button.png)](https://heroku.com/deploy)

## Running Locally

Make sure you have Java and Maven installed.  Also, install the [Heroku CLI](https://cli.heroku.com/).

```sh
$ git clone https://github.com/samiabudayeh/expedia_exercises.git
$ cd expedia_exercises
$ mvn package
$ target\bin\webapp.bat
```

Your app should now be running on [localhost:8080](http://localhost:8080).

## Deploying to Heroku

```sh
$ heroku create
$ git init
$ git add .
$ git commit -m "Ready to deploy"
$ git push heroku master
$ heroku open
```

## Documentation

For more information about using Java on Heroku, see these Dev Center articles:

- [Java on Heroku](https://devcenter.heroku.com/categories/java)
