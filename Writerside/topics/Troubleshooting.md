# Troubleshooting

ISP Nexus has multiple tools built-in to help track down network issues.
Coupled with external monitoring tools, troubleshooting your network is a quick and easy process.

## Built-In ISP Nexus Troubleshooting Tools

### Debug Page

<include from="Configuration.md" element-id="configuration-debug-article"/>

<include from="Configuration.md" element-id="configuration-debug-enable"/>

<include from="Configuration.md" element-id="configuration-debug-restart"/>

<include from="Configuration.md" element-id="configuration-debug-access"/>

### Device Manager

<procedure title="Viewing Devices in your Network">
    <step>The device manager can be found through the <control>Device Manager</control> button on your ISP Nexus dashboard</step>
    <img src="managed-devices.png" alt="Device manager" border-effect="line"/>
    <tip>IP information has been hidden in this screenshot</tip>
    <list>
        <li>This page can provide very useful information about your network</li>
        <li>When sorted by "Last Seen", you will see all the latest devices connecting to your network</li>
        <li>If no devices have connected recently, this could be an indication of an issue or outage in your network</li>
        <li>Device IP addresses are displayed allowing you to easily ping devices on your network</li>
    </list>
</procedure>

### Log Page

The detailed log page built into ISP Nexus provides output information about its different services.
A tile with a large amount of logs could be an indication of an issue or outage in the network.

<include from="Administration.md" element-id="operation-logs"/>

## External Tools

### Intermapper

Intermapper is network monitoring software that can be used to map out all IP devices in your network.
This map won't tell you what an issue is, but it is helpful for tracking how much of your network is online.

An isolated cluster of disconnected devices could indicate power outages, or issues with a specific switch.

### MikroTik WinBox

WinBox is used to view individual customer routers. A routers logs can be used to see if the DHCP server
is sending over the correct settings.

If ISP Nexus has the correct information but the router doesn't, performing a DHCP release from the ISP Nexus
Device Manager could fix the issue.

Use your network's RDP server to log in to customer routers.

## Potential Issues

### Power Outages

One of the most common causes of network downtime is local power outages. Check with your
local power company to see if there are any outages.

### Network Loop

<p>
    If you are seeing errors in your network relating to a <code>detected loop packet</code> or
    <code>received packet with own address as source</code>, a technician
    likely created a loop. Here is an example loop error from a MikroTik router:
</p>

<img src="mikrotik-loop-packet.png" alt="MikroTik looped packet" width="706" border-effect="line"/>

This can only be partially fixed remotely, as the technician will have to fix the loop.
However, disabling the port causing the looped packet will fix the outage for the remaining devices on the switch.

### Hypervisor Cluster Failure

If you are deploying ISP Nexus in a hypervisor cluster, a down node will likely cause issues. Check your
hypervisor service (i.e. Proxmox) to reboot nodes or restore them to a backup if needed.

### Sonar Payment Software

Sonar Software outages shouldn't cause issues in ISP Nexus. However, just in case they do, ISP Nexus has an
<emphasis>Offline Mode</emphasis> setting under
<control>Administration → Settings → SonarSync</control>. This setting uses cached data for
authentication, bypassing the Sonar payment service, allowing ISP Nexus to continue functioning.

This should only be used temporarily, as any changes to authentication
won't be reflected in ISP Nexus until it is reconnected with Sonar.