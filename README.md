This is my first android app! It's not much, I know. Onward to greatness!
instructions for linux only:
make sure the following are installed:
java
android sdk
make sure you know where sdk is installed
gradle

make sure usb debugging is enabled on your android phone: https://www.kingoapp.com/root-tutorials/how-to-enable-usb-debugging-mode-on-android.htm
connect the usb cable from your phone to your computer

cd into the location where you want to store the app on your computer
type the following into your terminal:
$git clone https://github.com/Malachi-Holden/first-app.git
$cd first-app
$echo "sdk.dir=/path/to/your/sdk/directory" >> local.properties
$chmod 777 setup.sh
$./setup.sh

the app should now be on your phone!
