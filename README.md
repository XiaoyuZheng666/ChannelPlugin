# cordova-plugin-xychannel- A Plugin for Cordova that can get channelid

##Requirements

 - IOS 7 or higher
 - Android 4.4

##Installation

    cordova plugin add cordova-plugin-xychannel
    
##Simple Usage


    cordova.plugins.ChannelPlugin.getChannel(function(msg){    
                       alert(msg);    
                   },function(msg){    
                        alet(msg);    
                  })

##Setting for Android
For example:
  In AndroidManifest.xml:
  In <Application> </Application>  
  add following:
  
            <meta-data
            android:name="XIAOYU_CHANNEL"
            android:value="${XIAOYU_CHANNEL_VALUE}" />
  
  and In build.gradle->app module
  add follwings:
  
     productFlavors {
        hautong {
            manifestPlaceholders = [XIAOYU_CHANNEL_VALUE: "huawei"]
        }
        xiaomi {
            manifestPlaceholders = [XIAOYU_CHANNEL_VALUE: "xiaomi"]
        }
        _360 {
            manifestPlaceholders = [XIAOYU_CHANNEL_VALUE: "_360"]
        }
        baidu {
            manifestPlaceholders = [XIAOYU_CHANNEL_VALUE: "baidu"]
        }
        wandoujia {
            manifestPlaceholders = [XIAOYU_CHANNEL_VALUE: "wandoujia"]
        }
    }   
    
you can change the XIAOYU_CHANNEL_VALUE if you like,and for ios,I returned "001"     



  
##LICENSE

The MIT License (MIT)

Copyright (c) 2018 xiaoyuzheng

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.


   
 

    
    
