# Prerequisites

<warning>TODO: overview article</warning>

## Hardware Requirements

<warning>TODO: you need this hardware because...</warning>

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
<li>
4x SFP+/SFP28 ports (10GB - 25GB)
<list type="alpha-lower">
<li>
VM Uplink (servers to internet)
</li>
<li>
VM Downlink (servers to network)
</li>
<li>
Cluster Data Network (storage network)
</li>
<li>
Cluster Sync Network (cluster communications and migrations)
</li>
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

<warning>
    TODO:
    <list>
        <li>you need this software because...</li>
        <li>expand on software requirements with detail/explanations</li>
    </list>
</warning>

<deflist>
<def title="Operating System for running ISP Nexus and DHCP Stream">
    <list><li>Ubuntu 18.04 - Ubuntu 24.10 (LTS Preferred)</li></list>
</def>
<def title="Recursive DNS">
    <list><li>Any linux that supports Unbound DNS</li>
    <li>All customer DNS requests</li></list>
</def>
<def title="Authoritative DNS">
    <list><li>Any linux that supports Webmin</li>
    <li>PTR and hosted domain requests</li></list>
</def>
<def title="LibreNMS">
    <list><li>Ubuntu 24.04 (None LTS, not recommended)</li>
    <li>Local network monitoring</li></list>
</def>
<def title="pfSense">
    <list><li>Server Firewalling & Routing</li>
    <li>Optional Certificate store and Radius Server</li></list>
</def>
<def title="RDP">
    <list><li>Linux or Windows Server (windows requires licenses)</li></list>
</def>
<def title="Mikrotik CHR">
    <list><li>VPN's</li>
    <li>Bandwidth testing</li></list>
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