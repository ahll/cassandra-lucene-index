/*
 * Copyright (C) 2014 Stratio (http://stratio.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.stratio.cassandra.lucene.search.sort.builder

import com.fasterxml.jackson.annotation.{JsonCreator, JsonProperty}
import com.stratio.cassandra.lucene.search.sort.GeoDistanceSortField

/**
 * @author Eduardo Alonso `eduardoalonso@stratio.com`
 *
 * @param field the name of the geo point field mapper to use to calculate distance
 * @param latitude the latitude of the center point to sort by min distance to it
 * @param longitude the longitude of the center point to sort by min distance to it
 */
class GeoDistanceSortFieldBuilder @JsonCreator() (@JsonProperty("field") val field : String,
                                    @JsonProperty("latitude") val latitude : Double,
                                    @JsonProperty("longitude") val longitude : Double) extends SortFieldBuilder[GeoDistanceSortField, GeoDistanceSortFieldBuilder] {

    /** @inheritdoc */
    override def build : GeoDistanceSortField =
        new GeoDistanceSortField(field, reverse, latitude, longitude)


}