package com.codersee.jsonbtojsonnode

import com.codersee.jsonbtojsonnode.repository.SomeEntityRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class MyRunner(
    private val repository: SomeEntityRepository
) : CommandLineRunner {

    override fun run(vararg args: String?) {
        repository.findAll()
            .forEach(::println)
    }
}