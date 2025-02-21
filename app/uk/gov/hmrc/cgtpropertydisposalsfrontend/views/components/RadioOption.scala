/*
 * Copyright 2021 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.cgtpropertydisposalsfrontend.views.components

import play.twirl.api.Html

final case class RadioOption(
  label: Html,
  content: Option[Html],
  optionHelpText: Option[Html],
  value: String,
  followedByOr: Boolean
)

object RadioOption {

  def apply(
    label: String,
    content: Option[Html],
    optionHelpText: Option[Html],
    value: String = "",
    followedByOr: Boolean = false
  ): RadioOption =
    RadioOption(Html(label), content, optionHelpText, value, followedByOr)

}
