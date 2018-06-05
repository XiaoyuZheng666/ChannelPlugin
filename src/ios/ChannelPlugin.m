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
        pluginResult=[CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:@"AppStore"];
        [self.commandDelegate sendPluginResult:pluginResult callbackId:callbackidStr];
    }
}

@end
