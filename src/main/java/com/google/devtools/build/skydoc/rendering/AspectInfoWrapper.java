// Copyright 2019 The Bazel Authors. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.devtools.build.skydoc.rendering;

import com.google.devtools.build.lib.events.Location;
import com.google.devtools.build.lib.syntax.BaseFunction;
import com.google.devtools.build.skydoc.rendering.proto.StardocOutputProtos.AspectInfo;

/** Stores information about a skylark aspect definition. */
public class AspectInfoWrapper {
  private final BaseFunction identifierFunction;
  private final Location location;
  // Only the Builder is passed to AspectInfoWrapper as the aspect name is not yet available.
  private final AspectInfo.Builder aspectInfo;

  public AspectInfoWrapper(
      BaseFunction identifierFunction, Location location, AspectInfo.Builder aspectInfo) {
    this.identifierFunction = identifierFunction;
    this.location = location;
    this.aspectInfo = aspectInfo;
  }

  public BaseFunction getIdentifierFunction() {
    return identifierFunction;
  }

  public Location getLocation() {
    return location;
  }

  public AspectInfo.Builder getAspectInfo() {
    return aspectInfo;
  }
}
