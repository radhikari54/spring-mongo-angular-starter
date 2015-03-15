var songControllers = angular.module('songControllers', []);

songControllers.controller('SongListController', [ '$scope', '$http', function($scope, $http) {
	$http.get('/api/songs')
		.success(function(songs) { $scope.songs = songs; })
		.error(function() { alert("Couldn't load songs"); });
} ]);
