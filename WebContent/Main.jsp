<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
	<style type="text/css">
		body, html {width: 100%;height: 100%;margin:0;font-family:"PingFang SC";}
		#allmap{width:100%;height:80%;}
		p{margin-left:5px; font-size:14px;}
	</style>
	<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=PsCOEf83XxWSYr4rRxGVhZ1W3gmtz43q"></script>
	<title>Car Track Management System</title>
</head>
<body>
	<div id="allmap"></div>
</body>
<script type="text/javascript">
	var map = new BMap.Map('allmap');
	map.centerAndZoom(new BMap.Point(121.40999949,31.23386171), 16);
	  
	map.addControl(new BMap.NavigationControl());        // 添加平移缩放控件
	map.addControl(new BMap.ScaleControl());             // 添加比例尺控件
	map.addControl(new BMap.OverviewMapControl());       //添加缩略地图控件
	map.enableScrollWheelZoom();                         //启用滚轮放大缩小
	map.disable3DBuilding();

	  map.setMapStyle({
		  styleJson:[
	          {
                  "featureType": "manmade",
                  "elementType": "all",
                  "stylers": {
                            "visibility": "off"
                  }
        },
        {
                  "featureType": "poi",
                  "elementType": "labels",
                  "stylers": {
                            "lightness": 7,
                            "visibility": "on"
                  }
        },
        {
                  "featureType": "land",
                  "elementType": "all",
                  "stylers": {
                            "color": "#0b1116"
                  }
        },
        {
                  "featureType": "railway",
                  "elementType": "all",
                  "stylers": {
                            "visibility": "off"
                  }
        },
        {
                  "featureType": "subway",
                  "elementType": "all",
                  "stylers": {
                            "visibility": "off"
                  }
        },
        {
                  "featureType": "road",
                  "elementType": "geometry",
                  "stylers": {
                            "color": "#1d4e7d"
                  }
        },
        {
                  "featureType": "green",
                  "elementType": "all",
                  "stylers": {
                            "visibility": "off"
                  }
        },
        {
                  "featureType": "water",
                  "elementType": "all",
                  "stylers": {
                            "color": "#000000"
                  }
        },
        {
                  "featureType": "building",
                  "elementType": "all",
                  "stylers": {
                            "color": "#000000"
                  }
        },
        {
                  "featureType": "poi",
                  "elementType": "labels.icon",
                  "stylers": {
                            "visibility": "off"
                  }
        },
        {
                  "featureType": "poi",
                  "elementType": "labels.text.stroke",
                  "stylers": {
                            "color": "#000000",
                            "visibility": "on"
                  }
        },
        {
                  "featureType": "road",
                  "elementType": "labels.text.stroke",
                  "stylers": {
                            "color": "#000000",
                            "visibility": "on"
                  }
        },
        {
                  "featureType": "road",
                  "elementType": "labels.text.fill",
                  "stylers": {
                            "color": "#ffffff",
                            "visibility": "on"
                  }
        },
        {
                  "featureType": "poi",
                  "elementType": "labels.text.fill",
                  "stylers": {
                            "color": "#cfe2f3"
                  }
        },
        {
                  "featureType": "label",
                  "elementType": "labels.text.stroke",
                  "stylers": {
                            "visibility": "on"
                  }
        },
        {
                  "featureType": "road",
                  "elementType": "geometry.stroke",
                  "stylers": {
                            "color": "#6286a9"
                  }
        }
]
		});
</script>
</html>



