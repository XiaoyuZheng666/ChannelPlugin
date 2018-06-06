//
//  CDVXYProgress.m
//  HelloCordova
//
//  Created by MAC005 on 2018/4/13.
//

#import "ChannelPlugin.h"
@implementation ChannelPlugin
- (void)getChannel:(CDVInvokedUrlCommand *)command
{
    CDVPluginResult*pluginResult =nil;
    
    NSString*callbackidStr=  command.callbackId;

    if (callbackidStr!=nil) {
        //获取版本号
        NSString *bundlePath = [[NSBundle mainBundle] pathForResource:@"Info" ofType:@"plist"];
        NSMutableDictionary *dict = [NSMutableDictionary dictionaryWithContentsOfFile:bundlePath];
        NSString *version = [dict objectForKey:@"ZHIKU_CHANNEL"];
        
        if (version==nil) {
            pluginResult=[CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:@"001"];
        }
        else
        {
            pluginResult=[CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:version];
        }
        
        [self.commandDelegate sendPluginResult:pluginResult callbackId:callbackidStr];
    }
}

@end
