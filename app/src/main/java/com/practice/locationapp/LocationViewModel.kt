package com.practice.locationapp

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.ViewModel

class LocationViewModel: ViewModel() {
    private val  _location= mutableStateOf<LocationData?>(null)
    val location: State<LocationData?> = _location
    fun UpdateLocation(newLocation: LocationData) {
        _location.value = newLocation
    }
}