curl -X POST 'https://api.dify.ai/v1/completion-messages' \
  --header "Authorization: Bearer ${singleStoryKey}" \
  --header 'Content-Type: application/json' \
  --data-raw '{
      "inputs": {"feature": "Hello, world!"},
      "response_mode": "streaming",
      "user": "phodal"
  }'
