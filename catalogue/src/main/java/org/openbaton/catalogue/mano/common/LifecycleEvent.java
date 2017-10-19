/*
 * Copyright (c) 2016 Open Baton (http://www.openbaton.org)
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
 *
 */

package org.openbaton.catalogue.mano.common;

import java.util.List;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import org.openbaton.catalogue.util.BaseEntity;

/**
 * Created by lto on 06/02/15.
 *
 * <p>Based on ETSI GS NFV-MAN 001 V1.1.1 (2014-12)
 */
@Entity
public class LifecycleEvent extends BaseEntity {

  @Enumerated(EnumType.STRING)
  private Event event;

  @ElementCollection(fetch = FetchType.EAGER)
  private List<String> lifecycle_events;

  public LifecycleEvent() {}

  @Override
  public String toString() {
    return "LifecycleEvent{"
        + "event="
        + event
        + ", lifecycle_events="
        + lifecycle_events
        + "} "
        + super.toString();
  }

  public Event getEvent() {
    return event;
  }

  public void setEvent(Event event) {
    this.event = event;
  }

  public List<String> getLifecycle_events() {
    return lifecycle_events;
  }

  public void setLifecycle_events(List<String> lifecycle_events) {
    this.lifecycle_events = lifecycle_events;
  }
}
