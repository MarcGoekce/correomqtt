package org.correomqtt.core.plugin.marketplace;

import org.correomqtt.core.eventbus.Event;

public record PluginEnabledFailedEvent(String pluginId) implements Event {
}
