package com.ryannewsom.androidkotlinstarter.base

/**
 * Created by Ryan on 12/4/17.
 */
interface BaseView<T> {
    fun setPresenter(presenter: T)
}