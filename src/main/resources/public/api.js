$(document).ready(function() {
    $.ajax({
        url: "http://api.openweathermap.org/data/2.5/weather?units=imperial&appid=f967d51335cda3d24ca7f37a82d36454&q=dallas,us"
    }).then(function(data) {
        	       $('.temperature').append(data.main.temp);
        	       $('.city').append(data.name);
        	       $('.humidity').append(data.main.humidity);
        	    })
        	})
