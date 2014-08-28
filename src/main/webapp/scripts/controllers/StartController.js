/**
 * Created by astensby on 25/08/14.
 */

'use strict';

angular.module('beerApp')
    .controller('StartController', ['$scope',  'BeerService', function($scope, BeerService){

        $scope.staticBeer = ['IPA', 'DoubleIPA', 'Pils'];

        $scope.awesomeBeer = BeerService.getBeer();

    }]);