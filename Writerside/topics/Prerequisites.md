# Prerequisites

<warning>TODO: overview article</warning>

## Hardware Requirements

ISP Nexus has varying hardware requirements depending on the scope of your network.

### ISP Nexus and DHCP Server

<list>
<li>SSD Storage (NVMe M.2 preferred)</li>
<li>10GB - 25GB Network Interface Card</li>
</list>

Some hardware requirements depend on how many subscribers you expect in your network.

<tabs title="test">
    <tab title="0 - 500">
        <procedure>
            <list>
                <li>4 vCPUs</li>
                <li>4GB RAM</li>
                <li>10GB Storage</li>
            </list>
        </procedure>
    </tab>
    <tab title="500 - 1000">
        <procedure>
            <list>
                <li>8 vCPUs</li>
                <li>8GB RAM</li>
                <li>20GB Storage</li>
            </list>
        </procedure>
    </tab>
    <tab title="1000 - 5000">
        <procedure>
            <list>
                <li>16 vCPUs</li>
                <li>16GB RAM</li>
                <li>40GB Storage</li>
            </list>
        </procedure>
    </tab>
    <tab title="5000+">
        <procedure>
            <list>
                <li>32+ vCPUs</li>
                <li>32GB RAM</li>
                <li>40GB Storage</li>
            </list>
        </procedure>
    </tab>
</tabs>

### Single Hypervisor

<list>
<li>Intelligent Platform Management Interface (IPMI), such as iDRAC Enterprise</li>
<li>4x SFP+/SFP28 ports (10GB - 25GB)
    <list type="alpha-lower">
        <li>VM Uplink (servers to internet)</li>
        <li>VM Downlink (servers to network)</li>
        <li>Cluster Data Network (storage network)</li>
        <li>Cluster Sync Network (cluster communications and migrations)</li>
    </list>
</li>
</list>

<tabs>
    <tab title="0 - 1000">
        <procedure>
            <list>
                <li>16 vCPUs</li>
                <li>32GB RAM</li>
                <li>1TB Storage</li>
            </list>
        </procedure>
    </tab>
    <tab title="1000 - 2500">
        <procedure>
            <list>
                <li>32 vCPUs</li>
                <li>32GB RAM</li>
                <li>1TB Storage</li>
            </list>
        </procedure>
    </tab>
    <tab title="2500 - 5000">
        <procedure>
            <list>
                <li>64 vCPUs</li>
                <li>64GB RAM</li>
                <li>1TB Storage</li>
            </list>
        </procedure>
    </tab>
    <tab title="5000+">
        <procedure>
            <list>
                <li>128+ vCPUs</li>
                <li>128GB RAM</li>
                <li>2TB Storage</li>
            </list>
        </procedure>
    </tab>
</tabs>

## Software Requirements

<p>
    This section details all required operating systems and software tools for running ISP Nexus,
    along with what they are used for. Additional non-required tools used for troubleshooting
    and network monitoring are detailed in the <a href="Troubleshooting.md"/> and <a href="Operation.md"/> sections.
</p>

<deflist>
<def title="Operating System for running ISP Nexus and DHCP Stream">
    <list>
        <li>
            Ubuntu 24.10 LTS or newer
            <list><li>Versions as old as Ubuntu 18.04 LTS <control>could</control>
            work but are <control>not supported or recommended</control> by Aspen Wireless</li></list>
        </li>
    </list>
</def>
<def title="Unbound DNS">
    <list><li>Used as a recursive DNS resolver</li>
    <li>Runs on any Linux distribution</li>
    <li>Handles all customer DNS requests</li></list>
</def>
<def title="Webmin DNS">
    <list><li>Used as authoritative DNS server</li>
    <li>Ran on any Linux distribution supported by Webmin</li>
    <li>Handles PTR and hosted domain requests</li></list>
</def>
<def title="LibreNMS">
    <list><li>Runs on Ubuntu 24.04 (LTS not recommended)</li>
    <li>Used for local network monitoring</li></list>
</def>
<def title="pfSense">
    <list><li>Used for server firewalling & routing</li>
    <li>Optionally, can be used for certificate storage and radius server</li></list>
</def>
<def title="Remote Desktop Solution">
    <list><li>Linux or Windows RDP Server (Windows requires Pro license on device that is being remotely accessed)</li></list>
</def>
<def title="MikroTik Cloud Hosted Router (CHR)">
    <list><li>Used as a VPN server to manage/route VPN traffic</li>
    <li>Also used for bandwidth testing and management</li></list>
</def>
<def title="Web Server">
    <list><li>Ubuntu LTS & OpenLiteSpeed & CyberPanel</li>
    <li>Auto SSL certs</li>
    <li>Reverse Proxy</li>
    <li>Any web hosting</li></list>
</def>
<def title="NTP Servers">
    <list><li>2 NTP containers for syncing time with all devices</li></list>
</def>
</deflist>