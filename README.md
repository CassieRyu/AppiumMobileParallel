# AppiumMobileParallel
IOS, Andriod. Selenium grid, Appium parallel
## Environment setup
Refer [here](https://github.com/CassieRyu/AppiumMobileParallel/blob/master/resources/Environment-Setup.md)
## Run on Single Thread
### iOS
* Start Appium server on port 4723
* Run sample file `src/tes/jave/IOS_Sample`
### Andriod
* Start Appium server on port 4723
* Run sample file `src/tes/jave/Android_Sample`
## Parallel using Selenium grid
* Download selenium grid standalone from [here]
* Specify your node file, check your local or remote server IP address `fconfig en0`
  sample file `grid/Node_iPhone8.json`, `grid/Node_iPhone7_Plus.json`
* One hub, many nodes; one node: node port, web driver agent port
* Config parameters in testng config file, sample file `testng_grid_parallel.xml`
* Start a hub
```
$ java -jar selenium-server-standalone-3.8.1.jar -role hub
```
* Register a node
```
$ appium --nodeconfig Node_iPhone7_Plus.json -p 4724 —webdriveragent-port 8100
```
* Register another node
```
$ appium --nodeconfig Node_iPhone8.json -p 4723 —webdriveragent-port 8101
```
* Run test
```
$ mvn test
```
## Parallel using Appium
* A new improvement has been introduced in Appium 1.7 release to support running parallel tests on a single Appium server instance.
* Parameters required: node port, wdAgent port, udid;  `$ instruments -s devices`
* Start Appium server on port 4723
* Config file, sample `testng_appium_parallel.xml` 
* Run test
