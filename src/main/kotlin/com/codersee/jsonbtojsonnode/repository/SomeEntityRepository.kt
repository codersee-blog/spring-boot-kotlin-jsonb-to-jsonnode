package com.codersee.jsonbtojsonnode.repository

import com.codersee.jsonbtojsonnode.model.SomeEntity
import org.springframework.data.repository.CrudRepository

interface SomeEntityRepository : CrudRepository<SomeEntity, Long>