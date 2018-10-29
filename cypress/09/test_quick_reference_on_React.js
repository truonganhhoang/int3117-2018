context('Test INSTALLATION', () => {
    beforeEach(() => {
        cy.visit('https://reactjs.org/');
        cy.get('nav.css-17o7gw8')
            .contains('Docs')
            .click();
        cy.get('ul.css-ts0qly').as('installation');
    });

    it('Cheat Sheet', () => {
        cy.get('@installation')
            .contains('Getting Started')
            .click();

        cy.location('pathname').should('include', 'getting-started');
    });

    it('Add React to a Website', () => {
        cy.get('@installation')
            .contains('Add React to a Website')
            .click();

        cy.location('pathname').should('include', 'add-react-to-a-website');

        cy.go('back');
        cy.location('pathname').should('not.include', 'add-react-to-a-webste');

        cy.go('forward');
        cy.location('pathname').should('include', 'add-react-to-a-website');
    });

    it('Create a New React App', () => {
        cy.get('@installation')
            .contains('Create a New React App')
            .click();

        cy.location('pathname').should('include', 'create-a-new-react-app');

        cy.get('h1.css-1a9m1x6').should('have.text', 'Create a New React App');
    });
});
