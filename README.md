# voice-assistant

##Raspberry preparation guide

Select OS -> Raspbian [Recommended]
Click Install

Click Next
Set Country to Lithuania
Language to British English
Timezone +2 Vilnius

Click Next, don't set the password
Select Wifi Network

If asks for update - click "yes"

## Install Java 8 on Raspberry

```
sudo apt-get update && sudo apt-get install oracle-java8-jdk
```


## Prepare voice assistant

Open terminal

```
sudo apt-get install maven

git clone https://github.com/mariusciziunas/voice-assistant
cd voice-assistant
./build.sh
./run.sh
```
