# AssisTU
Online collaborative educational environment for researchers

This application is developed using *[Play Framework](https://www.playframework.com/)* .

## Running the application

### Development:
To start developing you need to first install tools and dependencies.

Follow theses steps:
* Install Java Development Kit (JDK) 1.8 (skip this step if you have jdk 1.8)
*  Install activator from **[Typesafe website](https://typesafe.com/community/core-tools/activator-and-sbt)**
*  Install your favourite editor(Eclipse, Intellij, sublime text, etc.)
*  Navigate to your project folder and Run the application by typing `activator clean ~run` in the terminal

After following these steps you will notice the system files begins to compile and you will be able to view the application by going to `localhost:9000.


### Deployment: 
There are various ways of configuring the application according to the service used to deploy the application. We will here explain a general configuartion and later on show you an example of how to deploy the application on [Heroku](https://www.heroku.com/).
#### General Steps
If you are deploying on Heroku skip this section.

1. Install JDK 1.8
2.  configuring the Database: For the deployment of the application, you first need to configure the database. you can do that by first navigating to  `app/conf/` folder and changing the database configuration in `application.conf` file to your preferred DB. By convention, the default JDBC data source must be called default and the corresponding configuration properties are `db.default.driver` and `db.default.url`. 


#### On Heroku

1. Add the **Procfile**: Heroku requires a special file in the application root called `Procfile`. Create a simple text file with the following content and save the file in the root folder of the project(in the distro version this file already exists):

        web: target/universal/stage/bin/assistu -Dhttp.port=${PORT}  -DapplyEvolutions.default=true     -DapplyDownEvolutions.default=true -Ddb.default.driver=org.postgresql.Driver -Ddb.default.url=$DATABASE_URL`

2. Create a new repository in git: just create a new repository for your application by typing following command on terminal:

        git init
  
  Add the files to the git repository and commit:
  
        git add :/
        git commit -m .init





3. Create a new application on Heroku: You need first to have an Heroku account, and to install heroku gem. After doing that you can create a new application by doing following commands.

        heroku create --stack cedar
  
Now push the application to Heroku:
  
        git push heroku master
        
4. wait for Heroku to build the app with SBT(build file)
5. Open the application now running on your browser by typing :

        heroku open
