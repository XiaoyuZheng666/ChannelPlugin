# cordova-plugin-xychannel- A Plugin for Cordova that can get channelid

##Requirements

 - IOS 7 or higher

##Installation

    cordova plugin add cordova-plugin-xychannel
    
##Simple Usage


安卓：
在AndroidManifest.xml中添加
        <meta-data android:name="ZHIKU_CHANNEL" android:value="key${ZHIKU_CHANNEL_VALUE}" />

然后在build.gradle中productFlavors里面（ZHIKU_CHANNEL_VALUE就是你要写的渠道号）：
 productFlavors {
   guanfang{manifestPlaceholders = [ZHIKU_CHANNEL_VALUE: "222222"]}
}

IOS：
在项目target的info文件里面添加
key：ZHIKU_CHANNEL
type：String
Value：111111（这里根据需求修改渠道号）

cordova.plugins.ChannelPlugin.getChannel(function(msg){    
                       alert(msg);    
                   },function(msg){    
                        alet(msg);    
                  })

  
##LICENSE

The MIT License (MIT)

Copyright (c) 2018 xiaoyuzheng

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.


   
 

    
    
