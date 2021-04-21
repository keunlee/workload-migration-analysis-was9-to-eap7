# workload-migration-analysis-was9-to-eap7

```bash
# Path to MTA CLI Tool
export MTA_HOME=/path/to/mta/mta-cli-5.1.2.Final

# Create analysis report via CLI
$MTA_HOME/bin/mta-cli --input was9-ear-application.ear --output out --source websphere --target eap:7 --packages com.redhat
```