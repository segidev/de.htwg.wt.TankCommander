# TankCommander Webtech
## Setup
1. Startup Intellij IDEA
2. Open this repository as a project

### Add your game as module
3. Add your game with `File -> New -> Module from existing source`
    1. Select the `build.sbt` inside your game folder
    2. The game will now be added as another module
    
### Add your game as artifact
4. Add your game as artifact with `File -> Project Structure`
    1. Select `Artifacts` in the menu
    2. Click the `+ -> JAR -> From modules with dependencies...`
    3. In the dropdown **Module** select your game
    4. In **Main_Class** click on the folder icon right then select your main class
    5. Press **Ok**
    6. Select the new item in the list and change your output directory to your main projects  **lib** directory
        1. Example: /home/yourname/some/folder/WebTechnologien/de.htwg.wt.YourWebTechProject/lib
    7. Close the Project Structure dialog
    
### Build the artifact
5. In the top menu of idea click `Build -> Build Artifacts`
    1. Select your game.jar and run the **build**
    
### Add the artifact as library
6. Open up again `File -> Project Structure`
    1. In the menu left select **Libraries**
    2. Click `+ -> Java`
    3. Select your game.jar in the **lib** folder
    4. In the upcoming dialog select your webtech project name

You should now be able to use your game classes in your webtech project.

## Run the game
Open up a console and change into your webtech project directory then run `sbt run`

If everything went well you should see an output similar to this
```sbt
[info] Loading global plugins from /home/yourname/.sbt/1.0/plugins
[info] Loading settings for project de-htwg-wt-yourgame-build from plugins.sbt ...
[info] Loading project definition from /home/yourname/some/folder/WebTechnologien/de.htwg.wt.YourGame/project
[info] Loading settings for project root from build.sbt ...
[info] Set current project to tankcommander (in build file:/home/yourname/some/folder/WebTechnologien/de.htwg.wt.YourGame/)

--- (Running the application, auto-reloading is enabled) ---

[info] p.c.s.AkkaHttpServer - Listening for HTTP on /0:0:0:0:0:0:0:0:9000

(Server started, use Enter to stop and go back to the console...)

```

Visit the defined routes in your browser. The project (play) should compile then and show you the output in the browser.
