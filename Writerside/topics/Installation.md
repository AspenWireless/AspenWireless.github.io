# Installation

<p>
    Aspen Wireless uses a Debian install file to manage installation of ISP Nexus.
</p>

<procedure title="Get ISP Nexus Package">
    <step>Get Debian install file from our <a href="https://aspenwireless.net">downloads page</a></step>
    <step>Navigate to your linux terminal and install the package using <code>sudo dpkg -i ISPNexus.deb</code></step>
    <step>Start the service using <code>sudo systemctl enable ispnexus</code>
    then <code>sudo systemctl start ispnexus</code></step>
    <list>
        <li>If needed, safely stop or restart the service using <code>sudo systemctl stop ispnexus</code> and
        <code>sudo systemctl restart ispnexus</code> respectively</li>
    </list>
</procedure>

<tip>
    Note: Ensure your machine is licensed for ISP Nexus,
    otherwise the service won't have any functionality.
    See <a href="Licensing.md">licensing information here</a>.
</tip>

## First Deployment Setup

<p>
    Before fully deploying ISP Nexus, there is some basic setup to be done.
</p>

<procedure title="Creating Initial User">
    <step>Navigate to the ISP Nexus dashboard at <code>10.x.x.x:8080</code></step>
    <step>You will be prompted to enter a username and password.
    The credentials you enter will be saved as the <control>admin</control> user</step>
</procedure>

<tip>
    The IP <code>10.x.x.x</code> is simply a placeholder.
    Replace this with your machine's IPv4 address.
    The port on first deployment will be <code>8080</code>
</tip>

<procedure title="Configuring ISP Nexus Port" id="installation-configure-port">
    <p>
        Initially, ISP Nexus will deploy to port <code>8080</code>. You may want to change this,
        as it could cause conflicts with other services on your network.
    </p>
    <step>To configure the port, navigate to the web settings
    under <control>Administration → Settings → WebServer</control></step>
    <step>Configure <control>ServerPort</control> to your desired port and select <code>CHANGE</code></step>
    <img src="customer-list.png" alt="Server port config" border-effect="line"/>
</procedure>

<tip>Note: You will need to restart the ISP Nexus service for this to take effect.</tip>

## Verifying Installation

<p>
    ISP Nexus installation can be verified by navigating to the dashboard.
    Assuming the machine is licensed and the service is running, the dashboard won't display
    any licensing warnings and will contain full functionality.
</p>

<img src="customer-list.png" alt="ISP Nexus dashboard" border-effect="line" width="706"/>

<seealso style="cards">
    <category ref="related">
        <a href="Operation.topic" summary="Get started with operating and maintaining your new service">
            Operation Procedures</a>
        <a href="Configuration.md" summary="Learn about ISP Nexus configuration options">
            Configuration Options</a>
        <a href="Troubleshooting.md" summary="Prepare for outages before they arrive">
            Troubleshooting Pathways</a>
        <a href="Support.md" summary="Contact Aspen Wireless">
            Get Support</a>
    </category>
</seealso>