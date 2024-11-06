[Unit]
Description=ispnexus

[Service]
Type=simple
Restart=always
RestartSec=5s
ExecStart=/opt/ISP-Nexus/ispnexus
User=root
Group=root
WorkingDirectory=/opt/ISP-Nexus

[Install]
WantedBy=multi-user.target