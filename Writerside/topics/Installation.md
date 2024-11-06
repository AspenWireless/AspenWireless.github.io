# Installation

<warning>TODO: Overview article</warning>

## From Debian install file

<warning>Debian install not yet implemented in ISP Nexus</warning>

## From executable

<procedure title="Get the Executable">
    <step>Get <a href="https://www.aspensmart.net/">ISP Nexus</a> from the downloads page</step>
    <step>Navigate to <code>/opt</code> from the root of your Linux directory</step>
    <step>Create a new directory called <code>ISP-Nexus</code></step>
    <step>Place <code>ispnexus</code> executable and <code>webfiles</code> folder in this directory</step>
    <p>The full directory of the executable should be <code>/opt/ISP-Nexus/ispnexus</code></p>
</procedure>

<tip>
    Note: Ensure your machine is licensed for ISP Nexus,
    otherwise the service won't have any functionality.
    See <a href="Licensing.md">licensing information here</a>.
</tip>

## First Deployment Setup

<p>
    Before fully deploying ISP Nexus, there is some basic setup to be done.
    Use <code>sudo ./ispnexus</code> to soft-start the service in order to make these configurations.
    Use <code>CTRL+C</code> to stop the service after completing any configurations.
</p>

<procedure title="Creating Initial User">
    <step>Navigate to the ISP Nexus dashboard at <code>10.x.x.x::8080</code></step>
    <step>You will be prompted to enter a username and password.
    The credentials you enter will be saved as the <control>admin</control> user</step>
</procedure>

<tip>
    The IP <code>10.x.x.x</code> is simply a placeholder.
    Replace this with your machine's IPv4 address or <code>localhost</code>, depending on your needs and usage.
    The port on first deployment will be <code>8080</code>
</tip>

<procedure title="Configuring ISP Nexus Port">
    <list>
        <li>
            Initially, ISP Nexus will deploy to port <code>8080</code>. You may want to change this,
            as it could cause conflicts with other services on your network.
        </li>
    </list>
    <step>To configure the port, navigate to the web settings
    under <control>Administration → Settings → WebServer</control></step>
    <step>Configure <control>ServerPort</control> to your desired port and select <code>CHANGE</code></step>
    <img src="server-port.png" alt="Server port config" border-effect="line"/>
</procedure>

<tip>Note: you will need to restart the ISP Nexus service for this to take effect.</tip>

## Deploying with systemd

<p>
    For deploying ISP Nexus, you will want to use <code>systemd</code> so
    that the service is automatically started and stopped with the machine, and so
    it is restarted if the service were to have an unexpected failure.
</p>

<procedure title="Setting up systemd">
    <step>After ISP Nexus is installed and configured how you would like,
    navigate to <code>/etc/systemd/system</code> from your Linux root directory</step>
    <step>Create a file named <code>ispnexus.service</code> and paste the following contents:</step>
    <code-block src="ispnexus-service.kt"></code-block>
</procedure>

<list>
<li>Start the service using <code>systemctl start ispnexus</code></li>
<li>If needed, safely stop or restart the service using <code>systemctl stop ispnexus</code> and
<code>systemctl restart ispnexus</code> respectively</li>
</list>

### Verifying Installation

ISP Nexus installation can be verified by navigating to the dashboard.
Assuming the machine is licensed and the service is running, the dashboard won't display
any errors and will contain full functionality of the service.

<img src="dashboard.png" alt="ISP Nexus dashboard" border-effect="line" width="706"/>

<seealso style="cards">
    <category ref="related">
        <a href="Operation.md" summary="Get started with operating and maintaining your new service">
            Operation Procedures</a>
        <a href="Configuration.md" summary="Learn about ISP Nexus configuration options">
            Configuration Options</a>
        <a href="Troubleshooting.md" summary="Prepare for outages before they arrive">
            Troubleshooting Pathways</a>
        <a href="Support.md" summary="Contact Aspen Wireless">
            Get Support</a>
    </category>
</seealso>