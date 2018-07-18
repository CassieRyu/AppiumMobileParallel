# Appium Settings
This is a guideline on appium settings, aimed to run android emulator and iOS simulator with app, and using appium to inspect elements, recording operations, and etc.
## Environment Preparations
### Install Homebrew
* check command: `$ brew --version`
### Install Carthage
* command: `$ brew install carthage`
* This is a dependency check for appium-doctor but not really needed for Android. Install it anyway as you may do iOS automation in the future.
### Install JAVA
* check command: `$ java -version`
* `$ vi ~/.bash_profile` or `~/.profile` or `~/.zshrc`
* Add JAVA_HOME `export JAVA_HOME="/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home"`
* Add PATH `export PATH="$PATH:$JAVA_HOME/bin"`
* Add Class PATH `export CLASS_PATH="$JAVA_HOME/lib"`
### Install Ruby
* Check command: `$ ruby -v`
### Install Node
* Install Node: `$ brew install node`
* Test install by running `$ npm --version`. Verify version 5.3.X or greater is returned.
* Test Node is installed by running `$ node -v`. Verify version 8.5.X or greater is returned.
## Install Android Studio
* Download from [here](https://developer.android.com/studio/#mac-bundle)
### Install SDK
* Click *config* -> *SDK Manager*, you'll see the *SDK Location* and available *SDK Platform*`
* Choose the SDK platforms you want to download
* Check the **SDK Tools**, and install **Android Emulator**, **Android SDK Platform-Tools**, **Android SDK Tools**, **Intel x86 Emulator Accelerator**, and items under **Support Repository**
### Add Android Environment Variables
* `$ vi ~/.bash_profile` or `~/.profile` or `~/.zshrc`
* Add Android home variable:
`export ANDROID_HOME=//Users/YourUser/Library/Android/sdk` the **SDK Location** in Android Studio
* Add android path to existing path:
```
  export PATH="$PATH:$ANDROID_HOME/tools"
  export PATH="$PATH:$ANDROID_HOME/platform-tools"
  export PATH="$PATH:$ANDROID_HOME/build-tools"
```
### Test ADB Install
* Run `$ adb`
* you'll see **Android Debug Bridge version 1.0.39** or greater
* Launch devices you want, run `$ adb devices` will list you devices info are running;
### Install Emulator
* Open Android Studio -> open one project -> *Tools* -> *AVD Manager* -> *Create Virtual Devices*
* Choose the Devices you want to use
## Install Appium
* Download and install Appium desktop [here](http://appium.io/)
### Appium setup
* Run `$ npm install -g appium`
* Verify by `$ appium -v`
* Run `Run $ npm install -g appium-doctor`
* Run `$ appium-doctor`
* Verify info **AppiumDoctor Everything looks good, bye!** is displayed.
## Run Android Emulator on Appium
* Open Appium desktop, refer to [here](https://github.com/appium/appium-desktop) for more setting details
* Click button **Start Server v1.7.2** -> click **Inspector** icon -> input desired capabilities for connect emulator and your apk, [here](https://appium.io/docs/en/writing-running-appium/caps/) for each capabilities explanation
* Run `$ adb devices` to list the running emulators
* For example
![alt text](https://github.com/CassieRyu/AppiumMobileParallel/blob/master/resources/android-appium-capabilities.png "android appium desired capabilities setting")
* Start session
## Run iOS Simulator on Appium
### Run Simulator
* Install Xcode
* Open xCode -> *Xcode* -> *Open Developer Tool* -> *Simulator*
* if you want to change the device *Simulator* -> *Hardware* -> *Device* -> choose want you want
### With Appium
* Run `$ instruments -s devices` to list available simulators
* Same for above steps for appium
* Example for simulator's capabilities
![alt text](https://github.com/CassieRyu/AppiumMobileParallel/blob/tree/master/resources/iOS-appium-capabilities.png "iOS appium desired capabilities setting")
* please note: if you want to run your app on iOS simulators, you need **.app** package instead of **.ipa** package
* Start session
