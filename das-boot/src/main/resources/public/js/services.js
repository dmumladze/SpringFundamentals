angular.module('app.services', []).factory('Shipwreck', function($resource) {
  return $resource('/api/v1/shipwrecks/:id', { id: '@id' }, {
    update: {
      method: 'PUT'
    },
    save: {      
      method: 'POST',
      transformRequest: function(data) {
		  	debugger;
		    if (data === undefined)
		      return data;

		    var fd = new FormData();
		    var model = {};
		    angular.forEach(data, function(value, key) {
		      if (value instanceof FileList) {
		        if (value.length == 1) {
		          fd.append(key, value[0]);
		        } else {
		          angular.forEach(value, function(file, index) {
		            fd.append(key + '_' + index, file);
		          });
		        }
		      } else {
		    	  model[key] = value;
		      }
		    });
		    
		    fd.append('wreck', new Blob([JSON.stringify(model)], { type: "application/json" }));

		    return fd;
      },
      headers: { 'Content-Type': undefined }
    }
  });
}).service('popupService',function($window){
    this.showPopup=function(message){
        return $window.confirm(message);
    }
});
