/**
 * Created by astensby on 25/08/14.
 */

'use strict';

angular.module('beerApp', [
    'ngRoute', 'MyAwesomeServices'])
.config(['$routeProvider', function($routeProvider) {

        $routeProvider
            .when('/', {
                templateUrl: 'views/start.html',
                controller: 'StartController'
            })
            .otherwise({
                redirectTo: '/'
            });

    }]);