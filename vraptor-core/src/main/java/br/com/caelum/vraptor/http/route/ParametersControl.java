/***
 * Copyright (c) 2009 Caelum - www.caelum.com.br/opensource
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package br.com.caelum.vraptor.http.route;

import br.com.caelum.vraptor.http.MutableRequest;
import br.com.caelum.vraptor.http.Parameter;

public interface ParametersControl {

	/**
	 * wether the uri matches this uri
	 */
	boolean matches(String uri);

	/**
	 * creates a uri based on those parameter values
	 */
	String fillUri(Parameter[] paramNames, Object... paramValues);

	/**
	 * Inserts parameters extracted from the uri into the request parameters.
	 */
	void fillIntoRequest(String uri, MutableRequest request);

	/**
	 * Applies a list of values to
	 * @param values
	 * @return
	 */
	String apply(String[] values);

}
