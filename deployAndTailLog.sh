#!/bin/bash

tanzu apps workload delete  hin-artifact -n for-developer --yes && tanzu apps workload create -f config/workload.yaml -n for-developer --yes; tanzu apps workload tail hin-artifact --namespace for-developer
