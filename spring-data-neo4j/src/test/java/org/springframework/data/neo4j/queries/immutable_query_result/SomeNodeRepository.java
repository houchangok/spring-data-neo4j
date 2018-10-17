/*
 * Copyright (c) 2018 "Neo4j, Inc." / "Pivotal Software, Inc."
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.neo4j.queries.immutable_query_result;

import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

/**
 * @author Michael J. Simons
 */
public interface SomeNodeRepository extends Neo4jRepository<SomeNodeEntity, Long> {
	@Query("RETURN \"James Bond\" AS name, 7 AS aNumber")
	List<ImmutableQueryResult> findImmutableQueryResults();

	@Query("RETURN \"ames Bon\" AS name, 6 AS aNumber")
	List<ImmutableQueryResultWithNonFinalFields> findImmutableQueryResultsWithNonFinalFields();
}
