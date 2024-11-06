# ISP Nexus Installation

<warning>TODO: overview article</warning>

## Install from Debian File

<warning>TODO: build ISPNexus to debian install file & write associated instructions</warning>

## Install from Executable

<procedure>
    <step><a href="https://www.aspensmart.net/">Get ISP Nexus</a> from the downloads page</step>
    <step>Configure filesystem (placeholder image)
    <img src="completion_procedure.png" alt="filesystem layout" border-effect="line"/></step>
    <step><warning>TODO: Work out installation with Matt</warning></step>
</procedure>

<tip>
    Note: Ensure your machine is licensed for ISP Nexus,
    otherwise the service won't have any functionality.
    See <a href="Licensing.md">licensing information here</a>.
</tip>

## First Deployment

Initially, ISP Nexus will deploy to port <code>8080</code>. You may want to change this,
as it could cause conflicts with other services on your network. You will also need to
setup the initial admin user on first deployment.

<procedure title="First User and Configuring Port">
<list>
<li>Before fully deploying ISP Nexus, there is some basic setup to be done</li>
<li>Using <code>sudo ./ispnexus</code>, you can soft-start the service to make these configurations</li>
</list>
<list type="decimal">
<li>Navigate to the ISP Nexus dashboard at <code>192.0.2.0:8080</code></li>
<li>You will be prompted to enter a username and password.
The credentials you enter will be saved as the <control>admin</control> user</li>
<li>To configure the port, navigate to the web settings under <control>Administration → Settings → WebServer</control></li>
<li>Configure <control>ServerPort</control> to your desired port</li>
<li>Stop ISP Nexus service with <code>CTRL+C</code> in the same terminal you started it</li>
</list>
</procedure>

<tip>
    The IP <code>192.0.2.0</code> is simply a placeholder.
    Replace this with your machine's IPv4 address or <code>localhost</code>, depending on your needs and usage.
</tip>

## Final Deployment

<procedure title="Deploying ISP Nexus">
<list>
<li>For deploying ISP Nexus, you will want to use <code>systemctl</code>
so that the service is automatically started and stopped with the machine, and so
it is restarted if the service were to have an unexpected failure</li>
<li>Start the service using <code>systemctl start ispnexus</code></li>
<li>If needed, safely stop or restart the service using <code>systemctl stop ispnexus</code>
and <code>systemctl restart ispnexus</code> respectively</li>
</list>
</procedure>

### Verifying Installation

ISP Nexus installation can be verified by navigating to the dashboard.
Assuming the machine is licensed and the service is running, the dashboard won't display
any errors and will contain full functionality of the service.

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