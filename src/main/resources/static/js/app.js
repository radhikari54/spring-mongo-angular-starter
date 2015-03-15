var songApp = angular.module('songApp', [ 'ngRoute', 'songControllers' ]);

songApp.config([ '$routeProvider', function($routeProvider) {
  $routeProvider
    .when('/', { controller: 'SongListController', templateUrl: 'view/song-list.html' });
} ]);
