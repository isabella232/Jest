package io.searchbox.action;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.searchbox.client.JestResult;

import java.io.IOException;

/**
 * @author cihat keser
 */
public abstract class GenericResultAbstractDocumentTargetedAction extends AbstractDocumentTargetedAction<JestResult> {

    public GenericResultAbstractDocumentTargetedAction(Builder builder) {
        super(builder);
    }

    @Override
    public JestResult createNewElasticSearchResult(String responseBody, int statusCode, String reasonPhrase, ObjectMapper objectMapper) throws IOException {
        return createNewElasticSearchResult(new JestResult(objectMapper), responseBody, statusCode, reasonPhrase, objectMapper);
    }

}
