// url
var url = location.href;
url = url.replace('http://','');
url = "http://"+url.substr(0,url.indexOf('/'));
var ctx = url + "/ssmdemo";
