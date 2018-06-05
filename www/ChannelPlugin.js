var exec = require('cordova/exec');

function  ChannelPlugin() {};

exports.getChannel = function (success, error) {
    exec(success, error, 'ChannelPlugin', 'getChannel');
};

ChannelPlugin.prototype.getChannel = function (success,error) {

     exec(success, error, 'ChannelPlugin', 'getChannel', []);
};


//new一个Channel的类对象，并赋值给module.exports
var channelModel = new ChannelPlugin();
module.exports = channelModel;