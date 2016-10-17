/**
 * This file is part of the "finatra-hello" project.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the LICENSE is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 */

package com.elliotdwright.hello

import java.util.concurrent.atomic.AtomicInteger

import com.twitter.finagle.http.Request
import com.twitter.finatra.http.Controller

/**
 * HelloController
 *
 * @author Elliot Wright <elliot@elliotwright.co>
 */
class HelloController extends Controller {
  val counter = new AtomicInteger()

  get("/hello") { request: Request =>
    s"Hello request no ${counter.incrementAndGet()}"
  }

  post("/hello") { greetee: Greetee =>
    s"Hello, ${greetee.name}"
  }
}

case class Greetee(name: String = "World")
