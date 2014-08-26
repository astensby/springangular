/**
 * Created by astensby on 25/08/14.
 */

'use strict';

angular.module('MyAwesomeServices', ['ngResource'])
.factory('BeerService', ['$resource', function($resource){
        return $resource('http://localhost:8053/beer/api/javabeer', {}, {
           getBeer: {method: 'GET', isArray: true}
        });
    }]);